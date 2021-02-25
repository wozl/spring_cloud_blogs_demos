package com.config.client.configdatabases.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor //全参构造方法
@NoArgsConstructor//空参构造方法
@Data//set get方法
@Accessors(chain = true) //链式赋值写法支持

public class info {

    private Integer id;

    private String name;

    private String info;

}
