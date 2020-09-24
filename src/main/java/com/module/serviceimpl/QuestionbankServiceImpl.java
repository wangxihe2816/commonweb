package com.module.serviceimpl;

import com.module.mapper.QuestionbankMapper;
import com.module.pojo.Questionbank;
import com.module.service.QuestionbankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QuestionbankServiceImpl implements QuestionbankService {

    @Autowired
    QuestionbankMapper questionbankMapper;



    @Override
    public Questionbank selectQuestionbankById(Integer id) {
        return questionbankMapper.selectQuestionbankById(id);
    }

    @Override
    public List<Questionbank> selectQuestionbankList(Questionbank questionbank) {
        return questionbankMapper.selectQuestionbankList(questionbank);
    }

    @Override
    public List<Questionbank> selectAll(Map map) {
        return questionbankMapper.selectAll(map);
    }

    @Override
    public int insertQuestionbank(Questionbank questionbank) {
        return questionbankMapper.insertQuestionbank(questionbank);
    }

    @Override
    public int updateQuestionbank(Questionbank questionbank) {
        return questionbankMapper.updateQuestionbank(questionbank);
    }

    @Override
    public int batchUpdate(List<Questionbank> list) {
        return questionbankMapper.batchUpdate(list);
    }

    @Override
    public int deleteQuestionbankById(Integer id) {
        return questionbankMapper.deleteQuestionbankById(id);
    }

    @Override
    public int batchDeleteQuestionbank(Integer[] ids) {
        return questionbankMapper.batchDeleteQuestionbank(ids);
    }

    @Override
    public int batchAdd(List<Questionbank> list) {
        return questionbankMapper.batchAdd(list);
    }
}
