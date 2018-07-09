package com.zlinks.zlinks-service/src/main/java/com/zlinks/service/.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.zlinks.zlinks-repository/src/main/java/com/zlinks/domain/.GmeInfo;
import com.zlinks.zlinks-service/src/main/java/com/zlinks/service/.GmeInfoService;
import com.zlinks.zlinks-repository/src/main/java/com/zlinks/mapper/.GmeInfoDao;
import java.util.List;
import java.util.Map;

import com.hpxs.base.BaseMybatisDao;
import com.zlinks.core.mybatis.page.Pagination;

/**
 * 类说明:
 *
 * Created by noname on 2018-7-7 15:34:58
 */
@Service("gmeInfoService")
public class GmeInfoServiceImpl extends BaseMybatisDao<GmeInfoDao> implements GmeInfoService {

	@Autowired
	private GmeInfoDao gmeInfoDao;

	@Override
	public GmeInfo getById(int id) {
		return gmeInfoDao.getById(id);
	}

	@Override
	public int getListCount(GmeInfo entity) {
		return gmeInfoDao.getListCount(entity);
	}

	@Override
	public List<GmeInfo> getList(GmeInfo entity) {
		List<GmeInfo> resut = null;
		resut = gmeInfoDao.getList(entity);
		return resut;
	}

	@Override
	public int getListByMapCount(Map<String, Object> paramMap) {
		return gmeInfoDao.getListByMapCount(paramMap);
	}

	@Override
	public List<GmeInfo> getListByMap(Map<String, Object> paramMap) {
		List<GmeInfo> resut = null;
		resut = gmeInfoDao.getListByMap(paramMap);
		return resut;
	}

	@Override
	public int update(GmeInfo entity) {
		return gmeInfoDao.update(entity);
	}

	@Override
	public int deleteById(int id) {
		return gmeInfoDao.deleteById(id);
	}

	@Override
	public int add(GmeInfo entity) {
		return gmeInfoDao.add(entity);
	}

	@Override
	public int addList(List<GmeInfo> entityList) {
		return gmeInfoDao.addList(entityList);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Pagination<GmeInfo> findPage(Map<String,Object> paramMap, Integer pageNo,
			Integer pageSize) {
		return super.findPage(paramMap, pageNo, pageSize);
	}

	@Override
	public List<GmeInfo> getActivedList() {
		List<GmeInfo> resut = null;
		GmeInfo entity = new GmeInfo();
		entity.setIsDeleted(0);
		resut = gmeInfoDao.getList(entity);
		return resut;
	}
}