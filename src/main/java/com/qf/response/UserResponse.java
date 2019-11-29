package com.qf.response;

import com.qf.domain.User;
import lombok.Data;
import java.util.List;
//再定义一个实体类，此类主要用于分页
@Data
public class UserResponse {
    private List<User> list;
    private Integer page;
    private Long total;

}
