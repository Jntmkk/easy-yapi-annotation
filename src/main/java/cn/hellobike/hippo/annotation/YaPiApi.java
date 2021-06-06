package cn.hellobike.hippo.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target(value = {ElementType.METHOD})
@Inherited
public @interface YaPiApi {
	/**
	 * 路径,唯一，根据路径反查询，是更新还是新建
	 *
	 * @return
	 */
	String path();

	/**
	 * 不提供就公共分类，暂不提供按分类名称
	 *
	 * @return
	 */
	String catId() default "";

	/**
	 * 分类名称，由于分类名称可重复，因此{@link this#catId()}优先级比当前高
	 * 如果存在多个同名分类，则取第一个
	 *
	 * @return
	 */
	String catText() default "";

	/**
	 * 属于哪个服务，若不存在则提示
	 *
	 * @return
	 */
	String service() default "";

	/**
	 * 接口标题
	 *
	 * @return
	 */
	String title() default "title";

	/**
	 * 请求方法
	 *
	 * @return
	 */
	String method() default "POST";

	/**
	 * 描述
	 *
	 * @return
	 */
	String desc() default "description";

}
