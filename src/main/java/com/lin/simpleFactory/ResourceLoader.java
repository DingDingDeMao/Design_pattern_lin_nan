package com.lin.simpleFactory;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design_pattern_lin_nan.simpleFactory
 * @Date：2023/6/24 1:41
 * @Filename：ResourceLoader
 * @description:
 */
public class ResourceLoader {

    public Resource load(String url) {
        //获取url前缀
        String prefix = getPrefix(url);
        return null;
    }

    private String getPrefix(String url) {
        if (url == null || "".equals(url) ||!url.contains(":")){
            throw new ResourceLoadException("此资源url不合法");
        }
        String[] split = url.split(":");
        return split[0];
    }
}
