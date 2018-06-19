package com.elvis.android.lib.strict_code.plugin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 检测方法耗时的注解
 * Created by conghongjie on 2018/6/19.
 */

@Target(ElementType.METHOD)
public @interface Cost {
}
