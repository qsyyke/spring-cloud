package xyz.xcye.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：qsyyke
 * @description：TODO
 * @date ：2022/2/16 11:47 PM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
