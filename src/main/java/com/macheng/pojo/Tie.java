package com.macheng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author ：macheng
 * @description：TODO 铁剑 伤害为50
 * @date ：2023/3/12 17:46
 */

@Component("tie")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tie implements Weapon {
    private Integer weaponDamage; //铁剑的伤害值

//    @Value("铁剑")
    private String weaponName; //武器名字
    @Override
    public Integer hurt() {
        return weaponDamage;
    }
}
