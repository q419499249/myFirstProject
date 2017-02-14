package com.example.util;

import java.util.ArrayList;
import java.util.List;

import com.example.domain.SysPermission;
import com.example.domain.SysRole;
import com.example.domain.UserInfo;

public class TemplateUtils {
	public static UserInfo getUserInfo(){
		List<UserInfo> userInfoList=new ArrayList<UserInfo>();
		List<SysPermission> sysPermissionList=new ArrayList<SysPermission>();
		List<SysRole> sysRoleList=new ArrayList<SysRole>();
		UserInfo userInfo=new UserInfo();
		userInfo.setUid(1L);
		userInfo.setName("管理员");
		userInfo.setPassword("d3c59d25033dbf980d29554025c23a75");
		userInfo.setUsername("admin");
		userInfo.setSalt("8d78869f470951332959580424d4bf4f");
		userInfo.setRoleList(sysRoleList);
		userInfoList.add(userInfo);
		
		
		SysRole sysRole=new SysRole();
		sysRole.setId(1L);
		sysRole.setDescription("管理员");
		sysRole.setRole("admin");
		sysRole.setUserInfos(userInfoList);
		sysRole.setPermissions(sysPermissionList);
		
		SysRole sysRole1=new SysRole();
		sysRole1.setId(1L);
		sysRole1.setDescription("管理员");
		sysRole1.setRole("admin");
		sysRole1.setUserInfos(userInfoList);
		sysRole1.setPermissions(sysPermissionList);
		sysRoleList.add(sysRole);
		sysRoleList.add(sysRole1);

		
		SysPermission sysPermission=new SysPermission();
		sysPermission.setId(1L);
		sysPermission.setName("用户管理");
		sysPermission.setParentId(0L);
		sysPermission.setParentIds("0/");
		sysPermission.setResourceType("menu");
		sysPermission.setUrl("userInfo/userList");
		sysPermission.setPermission("userInfo:view");
		sysPermission.setRoles(sysRoleList);
		
		SysPermission sysPermission1=new SysPermission();
		sysPermission1.setId(2L);
		sysPermission1.setName("用户添加");
		sysPermission1.setParentId(1L);
		sysPermission1.setParentIds("0/1");
		sysPermission1.setResourceType("button");
		sysPermission1.setUrl("userInfo/userAdd");
		sysPermission1.setPermission("userInfo:add");
		sysPermission1.setRoles(sysRoleList);
		
		SysPermission sysPermission2=new SysPermission();
		sysPermission2.setId(3L);
		sysPermission2.setName("用户删除");
		sysPermission2.setParentId(1L);
		sysPermission2.setParentIds("0/1");
		sysPermission2.setResourceType("button");
		sysPermission2.setUrl("userInfo/userDel");
		sysPermission2.setPermission("userInfo:del");
		sysPermission2.setRoles(sysRoleList);
		
		sysPermissionList.add(sysPermission);
		sysPermissionList.add(sysPermission1);
		sysPermissionList.add(sysPermission2);
		return userInfoList.get(0);
	}
}
