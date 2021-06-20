package cn.hellobike.hippo.annotation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: yuewenbo971@hellobike.com
 * @Date: 2021/6/8 16:42
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class YaPiProjectEntity {
	String path;
	String catText;
	String catId;
	String service;
}