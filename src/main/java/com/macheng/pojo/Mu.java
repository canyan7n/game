package com.macheng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author ：macheng
 * @description：TODO 木剑 伤害为20
 * @date ：2023/3/12 17:46
 */

@Component("mu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mu implements Weapon {
    private Integer weaponDamage;//武器伤害值

    private String weaponName; //武器名字

    private Integer weaponId;//武器id
    @Override
    public Integer hurt() {
        return weaponDamage;
    }
}
