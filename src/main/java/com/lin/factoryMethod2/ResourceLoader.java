package com.lin.factoryMethod2;

import com.lin.factoryMethod.resourceFactory.IResourceLoader;
import com.lin.simpleFactory.Resource;
import com.lin.simpleFactory.ResourceLoadException;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design_pattern_lin_nan.factoryMethod.resourceFactory
 * @Date：2023/6/24 1:58
 * @Filename：ResourceLoader
 * @description:
 */
public class ResourceLoader {

    private IResourceLoader resourceLoader;
    private static Map<String, IResourceLoader> resourceLoaderCache = new HashMap<>(8);

    //版本二
//    static {
//        resourceLoaderCache.put("http",new HttpResourceLoader());
//        resourceLoaderCache.put("https",new HttpsResourceLoader());
//        resourceLoaderCache.put("ftp",new FtpResourceLoader());
//        resourceLoaderCache.put("file",new FileResourceLoader());
//        resourceLoaderCache.put("default",new DefaultResourceLoader());
//        resourceLoaderCache.put("classpath",new ClassPathResourceLoader());
//    }

    //版本三
    static {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("resourceLoader.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                String key = entry.getKey().toString();
                Class<?> clazz = Class.forName(entry.getValue().toString());
                IResourceLoader loader = (IResourceLoader) clazz.getConstructor().newInstance();
                resourceLoaderCache.put(key,loader);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Resource load(String url) {
        //url 前缀
        String prefix = getPrefix(url);

        //版本一
//        if("http".equals(prefix)){
//            resourceLoader = new HttpResourceLoader();
//        }else if("ftp".equals(prefix)){
//            resourceLoader = new FileResourceLoader();
//        }else if("file".equals(prefix)){
//            resourceLoader = new ClassPathResourceLoader();
//        }else if("default".equals(prefix)) {
//            resourceLoader = new ClassPathResourceLoader();
//        }else if("classpath".equals(prefix)) {
//            resourceLoader = new ClassPathResourceLoader();
//        } else if ("https".equals(prefix)) {
//            resourceLoader = new HttpsResourceLoader();
//        }
//        return resourceLoader.load(url);
        //版本二、和版本三
        return resourceLoaderCache.get(prefix).load(url);
    }

    private String getPrefix(String url) {
        if (url == null || "".equals(url) || !url.contains(":")) {
            throw new ResourceLoadException("资源不合法");
        }
        String[] split = url.split(":");
        return split[0];
    }
}
