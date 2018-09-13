package com.airron.service;

import java.util.List;

import com.airron.vo.TbDictExchange;

public interface DictService {
	List<TbDictExchange> getByOthername(String othername);
}
