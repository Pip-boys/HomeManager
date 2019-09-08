package com.bibiboy.bean.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.NotBlank;

import org.apache.commons.lang.StringUtils;


public class SysPermission {
    private Integer nId;
    
    @NotBlank(message="URL不能为空")
    private String vcUrl;

    private Integer nRoleId;
    
    @NotBlank(message="权限不能为空")
    private String vcPermission;

    private List<String> permissions;
    
    // 省略除permissions外的getter/setter
    public List<String> getPermissions() {
    	if (!StringUtils.isNotBlank(this.vcPermission)) {
    		this.vcPermission="";
			return new ArrayList<String>();
		}
        return Arrays.asList(this.vcPermission.trim().split(","));
    }
    
    //像这种取出双边的操作，可以加在改变数据时也可以加在查询时，但要根据需求变化，查询的频率一定大于更新的频率，所以将耗时操作放到频率低的更新操作上
    public void permissionListToString() {
    	this.vcPermission = this.permissions.toString().replace("[", "").replace("]", "").replace(" ", "");
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
    
    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getVcUrl() {
        return vcUrl;
    }

    public void setVcUrl(String vcUrl) {
        this.vcUrl = vcUrl == null ? null : vcUrl.trim();
    }

    public Integer getnRoleId() {
        return nRoleId;
    }

    public void setnRoleId(Integer nRoleId) {
        this.nRoleId = nRoleId;
    }

    public String getVcPermission() {
        return vcPermission;
    }

    public void setVcPermission(String vcPermission) {
        this.vcPermission = vcPermission == null ? null : vcPermission.trim();
    }
}