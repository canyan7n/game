package com.macheng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author ：macheng
 * @description：TODO 魔剑 伤害为100
 * @date ：2023/3/12 17:46
 */

@Component("mo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mo implements Weapon {
    private Integer weaponDamage;//武器伤害值

    private String weaponName;//武器名字

    @Override
    public Integer hurt() {
        return weaponDamage;
    }
}
