package cn.xjtu.zun.tiesheyuan.service;

import java.util.ArrayList;
import java.util.List;

import cn.xjtu.zun.tiesheyuan.mapper.GongchengxinxiMapper;
import cn.xjtu.zun.tiesheyuan.pojo.Gongchengxinxi;
import cn.xjtu.zun.tiesheyuan.pojo.GongchengxinxiExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GongchengxinxiService {
	
	@Autowired
	GongchengxinxiMapper gongchengxinxiMapper;
	public long add(Gongchengxinxi gongchengxinxi) {
		long result = gongchengxinxiMapper.insert(gongchengxinxi);
		// TODO Auto-generated method stub
		return result;
	}

	public int update(Gongchengxinxi gongchengxinxi) {
		int result =  gongchengxinxiMapper.updateByPrimaryKey(gongchengxinxi);
		// TODO Auto-generated method stub
		return result;
	}

	public Gongchengxinxi getById(long id) {
		Gongchengxinxi result =  gongchengxinxiMapper.selectByPrimaryKey(id);
		// TODO Auto-generated method stub
		return result;
	}

	public List<Gongchengxinxi> getAll() {
		GongchengxinxiExample example = new GongchengxinxiExample(); 
		List<Gongchengxinxi> Gongchengxinxi = gongchengxinxiMapper.selectByExample(example);
		return Gongchengxinxi;
		// TODO Auto-generated method stub
	}

	public int remove(long id) {
		int result = gongchengxinxiMapper.deleteByPrimaryKey(id);
		// TODO Auto-generated method stub
		return result;
	}

}
