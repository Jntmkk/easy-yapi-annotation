package cn.hellobike.hippo.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@Documented
public @interface YaPiProject {
    /**
     * 公共路径
     *
     * @return
     */
    String path() default "";

    String catText() default "";

    String catId() default "";

    String service() default "";
}
