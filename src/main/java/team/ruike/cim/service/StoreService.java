package team.ruike.cim.service;

import team.ruike.cim.pojo.Store;
import team.ruike.cim.util.Pager;

/**
 * 门店业务接口
 *
 * @author 甄立
 * @version 1.0
 */
public interface StoreService {
    /**
     * 查询门店数据
     *
     * @param store 查询条件
     * @param pager 分页辅助类
     */
    public void queryStore(Store store, Pager<Store> pager);

    /**
     * 根据ID查询门店数据
     *
     * @param storeId 门店ID
     * @return 门店对象
     */
    public Store queryStoreById(Integer storeId);


    /**
     * 添加门店
     *
     * @param store 门店对象
     */
    public void addStore(Store store);


    /**
     * 根据ID修改门店信息
     *
     * @param store 修改信息
     */
    public void updateStoreById(Store store);


    /**
     * 根据ID删除门店信息
     *
     * @param storeId 门店ID
     */
    public void deleteStoreById(Integer storeId);


}