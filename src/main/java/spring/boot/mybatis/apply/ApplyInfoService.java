package spring.boot.mybatis.apply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;

/**
 * service层使用分页
 * 
 * @author liqq
 *
 */
@Service
public class ApplyInfoService {

	@Autowired
	private ApplyInfoMapper applyInfoMapper;

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<ApplyInfo> getAll() {
		PageHelper.startPage(1, 10);
		List<ApplyInfo> ApplyInfoList = applyInfoMapper.selectAll();
		return ApplyInfoList;
	}

	/**
	 * 增加
	 * 
	 * @param applyInfo
	 * @return
	 */
	@Transactional
	public int addApply(ApplyInfo applyInfo) {
		return applyInfoMapper.insertSelective(applyInfo);
	}

	/**
	 * 修改
	 * 
	 * @param applyInfo
	 * @return
	 */
	@Transactional
	public int updateApply(ApplyInfo applyInfo) {
		return applyInfoMapper.updateByPrimaryKeySelective(applyInfo);
	}
}
