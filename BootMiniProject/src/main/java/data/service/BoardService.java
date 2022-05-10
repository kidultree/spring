package data.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.dto.BoardDto;
import data.mapper.BoardMapperInter;

@Service
public class BoardService implements BoardServiceInter {
	@Autowired
	private BoardMapperInter mapper;
	
	@Override
	public int getMaxNum() {
		return mapper.getMaxNum();
	}

	@Override
	public void updateReStep(int reg, int restep) {
		Map<String, Integer> map = new HashMap<>();
		map.put("reg", reg); //xml과 같은 이름으로 줄것 
		map.put("restep", restep); 
		mapper.updateReStep(map);
	}

	@Override
	public int getTotalCount() {
		return mapper.getTotalCount();
	}

	@Override
	public List<BoardDto> getList(int start, int perpage) {
		Map<String, Integer> map = new HashMap<>();
		map.put("start", start); //xml과 같은 이름으로 줄것 
		map.put("perpage", perpage); 
		return mapper.getList(map);
	}

	@Override
	public void insertBoard(BoardDto dto) { //그림판에서 그렸던 로직 다 들어감!
		int reg = dto.getReg();
		int restep=dto.getRestep();
		int relevel = dto.getRelevel();
		int num=dto.getNum();
					
	//새 글인경우
	if(num==0)
	{
		//새 글인 경우
		reg = this.getMaxNum()+1;
		restep=0;
		relevel=0;
	} else {
		//답글인 경우
		//기존 restep 보다 큰 값은 모두 1 증가하기
		this.updateReStep(reg, restep);
		//기존 값들보다 1 증가
		restep++;
		relevel++;
	}
		
	dto.setReg(reg);
	dto.setRestep(restep);
	dto.setRelevel(relevel);
	//insert
	mapper.insertBoard(dto);
}

	@Override
	public void updateReadCount(int num) {
		mapper.updateReadCount(num);
	}

	@Override
	public BoardDto getData(int num) {
		return mapper.getData(num);
	}

}
