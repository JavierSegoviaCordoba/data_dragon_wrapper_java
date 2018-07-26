package data_dragon.endpoints.cdn.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

public class Stats {

    @JsonProperty("FlatHPPoolMod")
    private Integer flatHPPoolMod;

    @JsonProperty("rFlatHPModPerLevel")
    private Integer rFlatHPModPerLevel;

    @JsonProperty("FlatMPPoolMod")
    private Integer flatMPPoolMod;

    @JsonProperty("rFlatMPModPerLevel")
    private Integer rFlatMPModPerLevel;

    @JsonProperty("PercentHPPoolMod")
    private Integer percentHPPoolMod;

    @JsonProperty("PercentMPPoolMod")
    private Integer percentMPPoolMod;

    @JsonProperty("FlatHPRegenMod")
    private Integer flatHPRegenMod;

    @JsonProperty("rFlatHPRegenModPerLevel")
    private Integer rFlatHPRegenModPerLevel;

    @JsonProperty("PercentHPRegenMod")
    private Integer percentHPRegenMod;

    @JsonProperty("FlatMPRegenMod")
    private Integer flatMPRegenMod;

    @JsonProperty("rFlatMPRegenModPerLevel")
    private Integer rFlatMPRegenModPerLevel;

    @JsonProperty("PercentMPRegenMod")
    private Integer percentMPRegenMod;

    @JsonProperty("FlatArmorMod")
    private Integer flatArmorMod;

    @JsonProperty("rFlatArmorModPerLevel")
    private Integer rFlatArmorModPerLevel;

    @JsonProperty("PercentArmorMod")
    private Integer percentArmorMod;

    @JsonProperty("rFlatArmorPenetrationMod")
    private Integer rFlatArmorPenetrationMod;

    @JsonProperty("rFlatArmorPenetrationModPerLevel")
    private Integer rFlatArmorPenetrationModPerLevel;

    @JsonProperty("rPercentArmorPenetrationMod")
    private Integer rPercentArmorPenetrationMod;

    @JsonProperty("rPercentArmorPenetrationModPerLevel")
    private Integer rPercentArmorPenetrationModPerLevel;

    @JsonProperty("FlatPhysicalDamageMod")
    private Integer flatPhysicalDamageMod;

    @JsonProperty("rFlatPhysicalDamageModPerLevel")
    private Integer rFlatPhysicalDamageModPerLevel;

    @JsonProperty("PercentPhysicalDamageMod")
    private Integer percentPhysicalDamageMod;

    @JsonProperty("FlatMagicDamageMod")
    private Integer flatMagicDamageMod;

    @JsonProperty("rFlatMagicDamageModPerLevel")
    private Integer rFlatMagicDamageModPerLevel;

    @JsonProperty("PercentMagicDamageMod")
    private Integer percentMagicDamageMod;

    @JsonProperty("FlatMovementSpeedMod")
    private Integer flatMovementSpeedMod;

    @JsonProperty("rFlatMovementSpeedModPerLevel")
    private Integer rFlatMovementSpeedModPerLevel;

    @JsonProperty("PercentMovementSpeedMod")
    private Integer percentMovementSpeedMod;

    @JsonProperty("rPercentMovementSpeedModPerLevel")
    private Integer rPercentMovementSpeedModPerLevel;

    @JsonProperty("FlatAttackSpeedMod")
    private Integer flatAttackSpeedMod;

    @JsonProperty("PercentAttackSpeedMod")
    private Integer percentAttackSpeedMod;

    @JsonProperty("rPercentAttackSpeedModPerLevel")
    private Integer rPercentAttackSpeedModPerLevel;

    @JsonProperty("rFlatDodgeMod")
    private Integer rFlatDodgeMod;

    @JsonProperty("rFlatDodgeModPerLevel")
    private Integer rFlatDodgeModPerLevel;

    @JsonProperty("PercentDodgeMod")
    private Integer percentDodgeMod;

    @JsonProperty("FlatCritChanceMod")
    private Integer flatCritChanceMod;

    @JsonProperty("rFlatCritChanceModPerLevel")
    private Integer rFlatCritChanceModPerLevel;

    @JsonProperty("PercentCritChanceMod")
    private Integer percentCritChanceMod;

    @JsonProperty("FlatCritDamageMod")
    private Integer flatCritDamageMod;

    @JsonProperty("rFlatCritDamageModPerLevel")
    private Integer rFlatCritDamageModPerLevel;

    @JsonProperty("PercentCritDamageMod")
    private Integer percentCritDamageMod;

    @JsonProperty("FlatBlockMod")
    private Integer flatBlockMod;

    @JsonProperty("PercentBlockMod")
    private Integer percentBlockMod;

    @JsonProperty("FlatSpellBlockMod")
    private Integer flatSpellBlockMod;

    @JsonProperty("rFlatSpellBlockModPerLevel")
    private Integer rFlatSpellBlockModPerLevel;

    @JsonProperty("PercentSpellBlockMod")
    private Integer percentSpellBlockMod;

    @JsonProperty("FlatEXPBonus")
    private Integer flatEXPBonus;

    @JsonProperty("PercentEXPBonus")
    private Integer percentEXPBonus;

    @JsonProperty("rPercentCooldownMod")
    private Integer rPercentCooldownMod;

    @JsonProperty("rPercentCooldownModPerLevel")
    private Integer rPercentCooldownModPerLevel;

    @JsonProperty("rFlatTimeDeadMod")
    private Integer rFlatTimeDeadMod;

    @JsonProperty("rFlatTimeDeadModPerLevel")
    private Integer rFlatTimeDeadModPerLevel;

    @JsonProperty("rPercentTimeDeadMod")
    private Integer rPercentTimeDeadMod;

    @JsonProperty("rPercentTimeDeadModPerLevel")
    private Integer rPercentTimeDeadModPerLevel;

    @JsonProperty("rFlatGoldPer10Mod")
    private Integer rFlatGoldPer10Mod;

    @JsonProperty("rFlatMagicPenetrationMod")
    private Integer rFlatMagicPenetrationMod;

    @JsonProperty("rFlatMagicPenetrationModPerLevel")
    private Integer rFlatMagicPenetrationModPerLevel;

    @JsonProperty("rPercentMagicPenetrationMod")
    private Integer rPercentMagicPenetrationMod;

    @JsonProperty("rPercentMagicPenetrationModPerLevel")
    private Integer rPercentMagicPenetrationModPerLevel;

    @JsonProperty("FlatEnergyRegenMod")
    private Integer flatEnergyRegenMod;

    @JsonProperty("rFlatEnergyRegenModPerLevel")
    private Integer rFlatEnergyRegenModPerLevel;

    @JsonProperty("FlatEnergyPoolMod")
    private Integer flatEnergyPoolMod;

    @JsonProperty("rFlatEnergyModPerLevel")
    private Integer rFlatEnergyModPerLevel;

    @JsonProperty("PercentLifeStealMod")
    private Integer percentLifeStealMod;

    @JsonProperty("PercentSpellVampMod")
    private Integer percentSpellVampMod;

    public Integer getFlatHPPoolMod() {
        return flatHPPoolMod;
    }

    public void setFlatHPPoolMod(Integer flatHPPoolMod) {
        this.flatHPPoolMod = flatHPPoolMod;
    }

    public Integer getrFlatHPModPerLevel() {
        return rFlatHPModPerLevel;
    }

    public void setrFlatHPModPerLevel(Integer rFlatHPModPerLevel) {
        this.rFlatHPModPerLevel = rFlatHPModPerLevel;
    }

    public Integer getFlatMPPoolMod() {
        return flatMPPoolMod;
    }

    public void setFlatMPPoolMod(Integer flatMPPoolMod) {
        this.flatMPPoolMod = flatMPPoolMod;
    }

    public Integer getrFlatMPModPerLevel() {
        return rFlatMPModPerLevel;
    }

    public void setrFlatMPModPerLevel(Integer rFlatMPModPerLevel) {
        this.rFlatMPModPerLevel = rFlatMPModPerLevel;
    }

    public Integer getPercentHPPoolMod() {
        return percentHPPoolMod;
    }

    public void setPercentHPPoolMod(Integer percentHPPoolMod) {
        this.percentHPPoolMod = percentHPPoolMod;
    }

    public Integer getPercentMPPoolMod() {
        return percentMPPoolMod;
    }

    public void setPercentMPPoolMod(Integer percentMPPoolMod) {
        this.percentMPPoolMod = percentMPPoolMod;
    }

    public Integer getFlatHPRegenMod() {
        return flatHPRegenMod;
    }

    public void setFlatHPRegenMod(Integer flatHPRegenMod) {
        this.flatHPRegenMod = flatHPRegenMod;
    }

    public Integer getrFlatHPRegenModPerLevel() {
        return rFlatHPRegenModPerLevel;
    }

    public void setrFlatHPRegenModPerLevel(Integer rFlatHPRegenModPerLevel) {
        this.rFlatHPRegenModPerLevel = rFlatHPRegenModPerLevel;
    }

    public Integer getPercentHPRegenMod() {
        return percentHPRegenMod;
    }

    public void setPercentHPRegenMod(Integer percentHPRegenMod) {
        this.percentHPRegenMod = percentHPRegenMod;
    }

    public Integer getFlatMPRegenMod() {
        return flatMPRegenMod;
    }

    public void setFlatMPRegenMod(Integer flatMPRegenMod) {
        this.flatMPRegenMod = flatMPRegenMod;
    }

    public Integer getrFlatMPRegenModPerLevel() {
        return rFlatMPRegenModPerLevel;
    }

    public void setrFlatMPRegenModPerLevel(Integer rFlatMPRegenModPerLevel) {
        this.rFlatMPRegenModPerLevel = rFlatMPRegenModPerLevel;
    }

    public Integer getPercentMPRegenMod() {
        return percentMPRegenMod;
    }

    public void setPercentMPRegenMod(Integer percentMPRegenMod) {
        this.percentMPRegenMod = percentMPRegenMod;
    }

    public Integer getFlatArmorMod() {
        return flatArmorMod;
    }

    public void setFlatArmorMod(Integer flatArmorMod) {
        this.flatArmorMod = flatArmorMod;
    }

    public Integer getrFlatArmorModPerLevel() {
        return rFlatArmorModPerLevel;
    }

    public void setrFlatArmorModPerLevel(Integer rFlatArmorModPerLevel) {
        this.rFlatArmorModPerLevel = rFlatArmorModPerLevel;
    }

    public Integer getPercentArmorMod() {
        return percentArmorMod;
    }

    public void setPercentArmorMod(Integer percentArmorMod) {
        this.percentArmorMod = percentArmorMod;
    }

    public Integer getrFlatArmorPenetrationMod() {
        return rFlatArmorPenetrationMod;
    }

    public void setrFlatArmorPenetrationMod(Integer rFlatArmorPenetrationMod) {
        this.rFlatArmorPenetrationMod = rFlatArmorPenetrationMod;
    }

    public Integer getrFlatArmorPenetrationModPerLevel() {
        return rFlatArmorPenetrationModPerLevel;
    }

    public void setrFlatArmorPenetrationModPerLevel(Integer rFlatArmorPenetrationModPerLevel) {
        this.rFlatArmorPenetrationModPerLevel = rFlatArmorPenetrationModPerLevel;
    }

    public Integer getrPercentArmorPenetrationMod() {
        return rPercentArmorPenetrationMod;
    }

    public void setrPercentArmorPenetrationMod(Integer rPercentArmorPenetrationMod) {
        this.rPercentArmorPenetrationMod = rPercentArmorPenetrationMod;
    }

    public Integer getrPercentArmorPenetrationModPerLevel() {
        return rPercentArmorPenetrationModPerLevel;
    }

    public void setrPercentArmorPenetrationModPerLevel(Integer rPercentArmorPenetrationModPerLevel) {
        this.rPercentArmorPenetrationModPerLevel = rPercentArmorPenetrationModPerLevel;
    }

    public Integer getFlatPhysicalDamageMod() {
        return flatPhysicalDamageMod;
    }

    public void setFlatPhysicalDamageMod(Integer flatPhysicalDamageMod) {
        this.flatPhysicalDamageMod = flatPhysicalDamageMod;
    }

    public Integer getrFlatPhysicalDamageModPerLevel() {
        return rFlatPhysicalDamageModPerLevel;
    }

    public void setrFlatPhysicalDamageModPerLevel(Integer rFlatPhysicalDamageModPerLevel) {
        this.rFlatPhysicalDamageModPerLevel = rFlatPhysicalDamageModPerLevel;
    }

    public Integer getPercentPhysicalDamageMod() {
        return percentPhysicalDamageMod;
    }

    public void setPercentPhysicalDamageMod(Integer percentPhysicalDamageMod) {
        this.percentPhysicalDamageMod = percentPhysicalDamageMod;
    }

    public Integer getFlatMagicDamageMod() {
        return flatMagicDamageMod;
    }

    public void setFlatMagicDamageMod(Integer flatMagicDamageMod) {
        this.flatMagicDamageMod = flatMagicDamageMod;
    }

    public Integer getrFlatMagicDamageModPerLevel() {
        return rFlatMagicDamageModPerLevel;
    }

    public void setrFlatMagicDamageModPerLevel(Integer rFlatMagicDamageModPerLevel) {
        this.rFlatMagicDamageModPerLevel = rFlatMagicDamageModPerLevel;
    }

    public Integer getPercentMagicDamageMod() {
        return percentMagicDamageMod;
    }

    public void setPercentMagicDamageMod(Integer percentMagicDamageMod) {
        this.percentMagicDamageMod = percentMagicDamageMod;
    }

    public Integer getFlatMovementSpeedMod() {
        return flatMovementSpeedMod;
    }

    public void setFlatMovementSpeedMod(Integer flatMovementSpeedMod) {
        this.flatMovementSpeedMod = flatMovementSpeedMod;
    }

    public Integer getrFlatMovementSpeedModPerLevel() {
        return rFlatMovementSpeedModPerLevel;
    }

    public void setrFlatMovementSpeedModPerLevel(Integer rFlatMovementSpeedModPerLevel) {
        this.rFlatMovementSpeedModPerLevel = rFlatMovementSpeedModPerLevel;
    }

    public Integer getPercentMovementSpeedMod() {
        return percentMovementSpeedMod;
    }

    public void setPercentMovementSpeedMod(Integer percentMovementSpeedMod) {
        this.percentMovementSpeedMod = percentMovementSpeedMod;
    }

    public Integer getrPercentMovementSpeedModPerLevel() {
        return rPercentMovementSpeedModPerLevel;
    }

    public void setrPercentMovementSpeedModPerLevel(Integer rPercentMovementSpeedModPerLevel) {
        this.rPercentMovementSpeedModPerLevel = rPercentMovementSpeedModPerLevel;
    }

    public Integer getFlatAttackSpeedMod() {
        return flatAttackSpeedMod;
    }

    public void setFlatAttackSpeedMod(Integer flatAttackSpeedMod) {
        this.flatAttackSpeedMod = flatAttackSpeedMod;
    }

    public Integer getPercentAttackSpeedMod() {
        return percentAttackSpeedMod;
    }

    public void setPercentAttackSpeedMod(Integer percentAttackSpeedMod) {
        this.percentAttackSpeedMod = percentAttackSpeedMod;
    }

    public Integer getrPercentAttackSpeedModPerLevel() {
        return rPercentAttackSpeedModPerLevel;
    }

    public void setrPercentAttackSpeedModPerLevel(Integer rPercentAttackSpeedModPerLevel) {
        this.rPercentAttackSpeedModPerLevel = rPercentAttackSpeedModPerLevel;
    }

    public Integer getrFlatDodgeMod() {
        return rFlatDodgeMod;
    }

    public void setrFlatDodgeMod(Integer rFlatDodgeMod) {
        this.rFlatDodgeMod = rFlatDodgeMod;
    }

    public Integer getrFlatDodgeModPerLevel() {
        return rFlatDodgeModPerLevel;
    }

    public void setrFlatDodgeModPerLevel(Integer rFlatDodgeModPerLevel) {
        this.rFlatDodgeModPerLevel = rFlatDodgeModPerLevel;
    }

    public Integer getPercentDodgeMod() {
        return percentDodgeMod;
    }

    public void setPercentDodgeMod(Integer percentDodgeMod) {
        this.percentDodgeMod = percentDodgeMod;
    }

    public Integer getFlatCritChanceMod() {
        return flatCritChanceMod;
    }

    public void setFlatCritChanceMod(Integer flatCritChanceMod) {
        this.flatCritChanceMod = flatCritChanceMod;
    }

    public Integer getrFlatCritChanceModPerLevel() {
        return rFlatCritChanceModPerLevel;
    }

    public void setrFlatCritChanceModPerLevel(Integer rFlatCritChanceModPerLevel) {
        this.rFlatCritChanceModPerLevel = rFlatCritChanceModPerLevel;
    }

    public Integer getPercentCritChanceMod() {
        return percentCritChanceMod;
    }

    public void setPercentCritChanceMod(Integer percentCritChanceMod) {
        this.percentCritChanceMod = percentCritChanceMod;
    }

    public Integer getFlatCritDamageMod() {
        return flatCritDamageMod;
    }

    public void setFlatCritDamageMod(Integer flatCritDamageMod) {
        this.flatCritDamageMod = flatCritDamageMod;
    }

    public Integer getrFlatCritDamageModPerLevel() {
        return rFlatCritDamageModPerLevel;
    }

    public void setrFlatCritDamageModPerLevel(Integer rFlatCritDamageModPerLevel) {
        this.rFlatCritDamageModPerLevel = rFlatCritDamageModPerLevel;
    }

    public Integer getPercentCritDamageMod() {
        return percentCritDamageMod;
    }

    public void setPercentCritDamageMod(Integer percentCritDamageMod) {
        this.percentCritDamageMod = percentCritDamageMod;
    }

    public Integer getFlatBlockMod() {
        return flatBlockMod;
    }

    public void setFlatBlockMod(Integer flatBlockMod) {
        this.flatBlockMod = flatBlockMod;
    }

    public Integer getPercentBlockMod() {
        return percentBlockMod;
    }

    public void setPercentBlockMod(Integer percentBlockMod) {
        this.percentBlockMod = percentBlockMod;
    }

    public Integer getFlatSpellBlockMod() {
        return flatSpellBlockMod;
    }

    public void setFlatSpellBlockMod(Integer flatSpellBlockMod) {
        this.flatSpellBlockMod = flatSpellBlockMod;
    }

    public Integer getrFlatSpellBlockModPerLevel() {
        return rFlatSpellBlockModPerLevel;
    }

    public void setrFlatSpellBlockModPerLevel(Integer rFlatSpellBlockModPerLevel) {
        this.rFlatSpellBlockModPerLevel = rFlatSpellBlockModPerLevel;
    }

    public Integer getPercentSpellBlockMod() {
        return percentSpellBlockMod;
    }

    public void setPercentSpellBlockMod(Integer percentSpellBlockMod) {
        this.percentSpellBlockMod = percentSpellBlockMod;
    }

    public Integer getFlatEXPBonus() {
        return flatEXPBonus;
    }

    public void setFlatEXPBonus(Integer flatEXPBonus) {
        this.flatEXPBonus = flatEXPBonus;
    }

    public Integer getPercentEXPBonus() {
        return percentEXPBonus;
    }

    public void setPercentEXPBonus(Integer percentEXPBonus) {
        this.percentEXPBonus = percentEXPBonus;
    }

    public Integer getrPercentCooldownMod() {
        return rPercentCooldownMod;
    }

    public void setrPercentCooldownMod(Integer rPercentCooldownMod) {
        this.rPercentCooldownMod = rPercentCooldownMod;
    }

    public Integer getrPercentCooldownModPerLevel() {
        return rPercentCooldownModPerLevel;
    }

    public void setrPercentCooldownModPerLevel(Integer rPercentCooldownModPerLevel) {
        this.rPercentCooldownModPerLevel = rPercentCooldownModPerLevel;
    }

    public Integer getrFlatTimeDeadMod() {
        return rFlatTimeDeadMod;
    }

    public void setrFlatTimeDeadMod(Integer rFlatTimeDeadMod) {
        this.rFlatTimeDeadMod = rFlatTimeDeadMod;
    }

    public Integer getrFlatTimeDeadModPerLevel() {
        return rFlatTimeDeadModPerLevel;
    }

    public void setrFlatTimeDeadModPerLevel(Integer rFlatTimeDeadModPerLevel) {
        this.rFlatTimeDeadModPerLevel = rFlatTimeDeadModPerLevel;
    }

    public Integer getrPercentTimeDeadMod() {
        return rPercentTimeDeadMod;
    }

    public void setrPercentTimeDeadMod(Integer rPercentTimeDeadMod) {
        this.rPercentTimeDeadMod = rPercentTimeDeadMod;
    }

    public Integer getrPercentTimeDeadModPerLevel() {
        return rPercentTimeDeadModPerLevel;
    }

    public void setrPercentTimeDeadModPerLevel(Integer rPercentTimeDeadModPerLevel) {
        this.rPercentTimeDeadModPerLevel = rPercentTimeDeadModPerLevel;
    }

    public Integer getrFlatGoldPer10Mod() {
        return rFlatGoldPer10Mod;
    }

    public void setrFlatGoldPer10Mod(Integer rFlatGoldPer10Mod) {
        this.rFlatGoldPer10Mod = rFlatGoldPer10Mod;
    }

    public Integer getrFlatMagicPenetrationMod() {
        return rFlatMagicPenetrationMod;
    }

    public void setrFlatMagicPenetrationMod(Integer rFlatMagicPenetrationMod) {
        this.rFlatMagicPenetrationMod = rFlatMagicPenetrationMod;
    }

    public Integer getrFlatMagicPenetrationModPerLevel() {
        return rFlatMagicPenetrationModPerLevel;
    }

    public void setrFlatMagicPenetrationModPerLevel(Integer rFlatMagicPenetrationModPerLevel) {
        this.rFlatMagicPenetrationModPerLevel = rFlatMagicPenetrationModPerLevel;
    }

    public Integer getrPercentMagicPenetrationMod() {
        return rPercentMagicPenetrationMod;
    }

    public void setrPercentMagicPenetrationMod(Integer rPercentMagicPenetrationMod) {
        this.rPercentMagicPenetrationMod = rPercentMagicPenetrationMod;
    }

    public Integer getrPercentMagicPenetrationModPerLevel() {
        return rPercentMagicPenetrationModPerLevel;
    }

    public void setrPercentMagicPenetrationModPerLevel(Integer rPercentMagicPenetrationModPerLevel) {
        this.rPercentMagicPenetrationModPerLevel = rPercentMagicPenetrationModPerLevel;
    }

    public Integer getFlatEnergyRegenMod() {
        return flatEnergyRegenMod;
    }

    public void setFlatEnergyRegenMod(Integer flatEnergyRegenMod) {
        this.flatEnergyRegenMod = flatEnergyRegenMod;
    }

    public Integer getrFlatEnergyRegenModPerLevel() {
        return rFlatEnergyRegenModPerLevel;
    }

    public void setrFlatEnergyRegenModPerLevel(Integer rFlatEnergyRegenModPerLevel) {
        this.rFlatEnergyRegenModPerLevel = rFlatEnergyRegenModPerLevel;
    }

    public Integer getFlatEnergyPoolMod() {
        return flatEnergyPoolMod;
    }

    public void setFlatEnergyPoolMod(Integer flatEnergyPoolMod) {
        this.flatEnergyPoolMod = flatEnergyPoolMod;
    }

    public Integer getrFlatEnergyModPerLevel() {
        return rFlatEnergyModPerLevel;
    }

    public void setrFlatEnergyModPerLevel(Integer rFlatEnergyModPerLevel) {
        this.rFlatEnergyModPerLevel = rFlatEnergyModPerLevel;
    }

    public Integer getPercentLifeStealMod() {
        return percentLifeStealMod;
    }

    public void setPercentLifeStealMod(Integer percentLifeStealMod) {
        this.percentLifeStealMod = percentLifeStealMod;
    }

    public Integer getPercentSpellVampMod() {
        return percentSpellVampMod;
    }

    public void setPercentSpellVampMod(Integer percentSpellVampMod) {
        this.percentSpellVampMod = percentSpellVampMod;
    }

    @Override
    public String toString() {
        return "stats:{" +
                "flatHPPoolMod=" + getFlatHPPoolMod() +
                ", rFlatHPModPerLevel=" + getrFlatHPModPerLevel() +
                ", flatMPPoolMod=" + getFlatMPPoolMod() +
                ", rFlatMPModPerLevel=" + getrFlatMPModPerLevel() +
                ", percentHPPoolMod=" + getPercentHPPoolMod() +
                ", percentMPPoolMod=" + getPercentMPPoolMod() +
                ", flatHPRegenMod=" + getFlatHPRegenMod() +
                ", rFlatHPRegenModPerLevel=" + getrFlatHPRegenModPerLevel() +
                ", percentHPRegenMod=" + getPercentHPRegenMod() +
                ", flatMPRegenMod=" + getFlatMPRegenMod() +
                ", rFlatMPRegenModPerLevel=" + getrFlatMPRegenModPerLevel() +
                ", percentMPRegenMod=" + getPercentMPRegenMod() +
                ", flatArmorMod=" + getFlatArmorMod() +
                ", rFlatArmorModPerLevel=" + getrFlatArmorModPerLevel() +
                ", percentArmorMod=" + getPercentArmorMod() +
                ", rFlatArmorPenetrationMod=" + getrFlatArmorPenetrationMod() +
                ", rFlatArmorPenetrationModPerLevel=" + getrFlatArmorPenetrationModPerLevel() +
                ", rPercentArmorPenetrationMod=" + getrPercentArmorPenetrationMod() +
                ", rPercentArmorPenetrationModPerLevel=" + getrPercentArmorPenetrationModPerLevel() +
                ", flatPhysicalDamageMod=" + getFlatPhysicalDamageMod() +
                ", rFlatPhysicalDamageModPerLevel=" + getrFlatPhysicalDamageModPerLevel() +
                ", percentPhysicalDamageMod=" + getPercentPhysicalDamageMod() +
                ", flatMagicDamageMod=" + getFlatMagicDamageMod() +
                ", rFlatMagicDamageModPerLevel=" + getrFlatMagicDamageModPerLevel() +
                ", percentMagicDamageMod=" + getPercentMagicDamageMod() +
                ", flatMovementSpeedMod=" + getFlatMovementSpeedMod() +
                ", rFlatMovementSpeedModPerLevel=" + getrFlatMovementSpeedModPerLevel() +
                ", percentMovementSpeedMod=" + getPercentMovementSpeedMod() +
                ", rPercentMovementSpeedModPerLevel=" + getrPercentMovementSpeedModPerLevel() +
                ", flatAttackSpeedMod=" + getFlatAttackSpeedMod() +
                ", percentAttackSpeedMod=" + getPercentAttackSpeedMod() +
                ", rPercentAttackSpeedModPerLevel=" + getrPercentAttackSpeedModPerLevel() +
                ", rFlatDodgeMod=" + getrFlatDodgeMod() +
                ", rFlatDodgeModPerLevel=" + getrFlatDodgeModPerLevel() +
                ", percentDodgeMod=" + getPercentDodgeMod() +
                ", flatCritChanceMod=" + getFlatCritChanceMod() +
                ", rFlatCritChanceModPerLevel=" + getrFlatCritChanceModPerLevel() +
                ", percentCritChanceMod=" + getPercentCritChanceMod() +
                ", flatCritDamageMod=" + getFlatCritDamageMod() +
                ", rFlatCritDamageModPerLevel=" + getrFlatCritDamageModPerLevel() +
                ", percentCritDamageMod=" + getPercentCritDamageMod() +
                ", flatBlockMod=" + getFlatBlockMod() +
                ", percentBlockMod=" + getPercentBlockMod() +
                ", flatSpellBlockMod=" + getFlatSpellBlockMod() +
                ", rFlatSpellBlockModPerLevel=" + getrFlatSpellBlockModPerLevel() +
                ", percentSpellBlockMod=" + getPercentSpellBlockMod() +
                ", flatEXPBonus=" + getFlatEXPBonus() +
                ", percentEXPBonus=" + getPercentEXPBonus() +
                ", rPercentCooldownMod=" + getrPercentCooldownMod() +
                ", rPercentCooldownModPerLevel=" + getrPercentCooldownModPerLevel() +
                ", rFlatTimeDeadMod=" + getrFlatTimeDeadMod() +
                ", rFlatTimeDeadModPerLevel=" + getrFlatTimeDeadModPerLevel() +
                ", rPercentTimeDeadMod=" + getrPercentTimeDeadMod() +
                ", rPercentTimeDeadModPerLevel=" + getrPercentTimeDeadModPerLevel() +
                ", rFlatGoldPer10Mod=" + getrFlatGoldPer10Mod() +
                ", rFlatMagicPenetrationMod=" + getrFlatMagicPenetrationMod() +
                ", rFlatMagicPenetrationModPerLevel=" + getrFlatMagicPenetrationModPerLevel() +
                ", rPercentMagicPenetrationMod=" + getrPercentMagicPenetrationMod() +
                ", rPercentMagicPenetrationModPerLevel=" + getrPercentMagicPenetrationModPerLevel() +
                ", flatEnergyRegenMod=" + getFlatEnergyRegenMod() +
                ", rFlatEnergyRegenModPerLevel=" + getrFlatEnergyRegenModPerLevel() +
                ", flatEnergyPoolMod=" + getFlatEnergyPoolMod() +
                ", rFlatEnergyModPerLevel=" + getrFlatEnergyModPerLevel() +
                ", percentLifeStealMod=" + getPercentLifeStealMod() +
                ", percentSpellVampMod=" + getPercentSpellVampMod() +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}
