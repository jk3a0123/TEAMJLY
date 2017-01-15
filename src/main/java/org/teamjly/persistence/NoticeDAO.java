package org.teamjly.persistence;


import java.util.List;
import org.teamjly.domain.NoticeVO;

public interface NoticeDAO {
	
	public void create(NoticeVO vo) throws Exception;
	
	public NoticeVO read(Integer nno) throws Exception;
	
	public void update(NoticeVO vo) throws Exception;
	
	public void delete(Integer nno )throws Exception;
	
	public List<NoticeVO> getList()throws Exception;
	
	


}
