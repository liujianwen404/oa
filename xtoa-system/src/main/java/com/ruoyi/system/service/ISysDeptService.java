package com.ruoyi.system.service;

import java.util.List;
import java.util.Map;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.system.domain.SysDept;
import com.ruoyi.system.domain.SysRole;

/**
 * 部门管理 服务层
 * 
 * @author ruoyi
 */
public interface ISysDeptService
{
    /**
     * 查询部门管理数据（带数据权限）
     * 
     * @param dept 部门信息
     * @return 部门信息集合
     */
    public List<SysDept> selectDeptList(SysDept dept);

    /**
     * 查询部门管理数据（不带数据权限）
     *
     * @param dept 部门信息
     * @return 部门信息集合
     */
    public List<SysDept> selectDeptListAll(SysDept dept);

    /**
     * 查询部门管理树
     * 
     * @param dept 部门信息
     * @return 所有部门信息
     */
    public List<Ztree> selectDeptTree(SysDept dept);

    /**
     * 根据角色ID查询菜单
     *
     * @param role 角色对象
     * @return 菜单列表
     */
    public List<Ztree> roleDeptTreeData(SysRole role);

    /**
     * 查询部门人数
     * 
     * @param parentId 父部门ID
     * @return 结果
     */
    public int selectDeptCount(Long parentId);

    /**
     * 查询部门是否存在用户
     * 
     * @param deptId 部门ID
     * @return 结果 true 存在 false 不存在
     */
    public boolean checkDeptExistUser(Long deptId);

    /**
     * 删除部门管理信息
     * 
     * @param deptId 部门ID
     * @return 结果
     */
    public int deleteDeptById(Long deptId);
    /**
     * 物理删除部门管理信息
     *
     * @param deptId 部门ID
     * @return 结果
     */
    public int deleteById(Long deptId);


    /**
     * 新增保存部门信息
     * 
     * @param dept 部门信息
     * @param loginName
     * @return 结果
     */
    public AjaxResult insertDept(SysDept dept, String loginName);

    /**
     * 修改保存部门信息
     * 
     * @param dept 部门信息
     * @return 结果
     */
    public int updateDept(SysDept dept);

    /**
     * 根据部门ID查询信息
     * 
     * @param deptId 部门ID
     * @return 部门信息
     */
    public SysDept selectDeptById(Long deptId);

    SysDept selectDeptByIdSimple(Long deptId);

    /**
     * 校验部门名称是否唯一
     * 
     * @param dept 部门信息
     * @return 结果
     */
    public String checkDeptNameUnique(SysDept dept);

    List<SysDept> getDeptAll();

    void  checkUserIsLeader(String leader);

    SysDept selectOneDeptByName(String deptName6, Long pId);

    List<SysDept> roleDeptListById(Long deptId);

    List<SysDept> selectFirstDeptData();

    List<SysDept> roleMenuDeptListById(Long roleId, Long menuId);

    List<Long> selectFirstDeptIdAndSon(Long deptId);

    SysDept selectCompanyByUserDeptId(Long deptId);

    /**
     * 根据部门ID返回该部门对应的所有上级部门（不包括集团和公司）
     * @param deptId
     * @return
     */
    List<SysDept> selectDeptByUserDeptId(Long deptId);
}
