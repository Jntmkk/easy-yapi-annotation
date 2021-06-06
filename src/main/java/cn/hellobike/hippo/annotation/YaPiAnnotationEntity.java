package cn.hellobike.hippo.annotation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: yuewenbo971@hellobike.com
 * @Date: 2021/5/29 17:56
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class YaPiAnnotationEntity {
	/**
	 * 路径,唯一，根据路径反查询，是更新还是新建
	 *
	 * @return
	 */
	String path;

	/**
	 * 不提供就公共分类，暂不提供按分类名称
	 *
	 * @return
	 */
	String catId;

	/**
	 * 分类名称，由于分类名称可重复，优先级比当前高
	 * 如果存在多个同名分类，则取第一个
	 *
	 * @return
	 */
	String catText;

	/**
	 * 属于哪个服务，若不存在则提示
	 *
	 * @return
	 */
	String service;

	/**
	 * 接口标题
	 *
	 * @return
	 */
	String title;

	/**
	 * 请求方法
	 *
	 * @return
	 */
	String method;

	/**
	 * 描述
	 *
	 * @return
	 */
	String desc;
}