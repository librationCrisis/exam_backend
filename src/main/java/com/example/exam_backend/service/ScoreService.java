package com.example.exam_backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.exam_backend.entity.Score;

import java.util.List;

/**
 * <p>
 * 成绩管理表 服务类
 * </p>
 *
 * @author LibrationCrisis
 * @since 2020-12-22
 */
public interface ScoreService extends IService<Score> {

    /**
     * 根据学生ID查找成绩 不分页
     *
     * @param studentId 学生ID
     * @return Score list
     */
    List<Score> findById(Integer studentId);

    /**
     * 根据学生ID查找成绩 分页
     *
     * @param page      当前页
     * @param size      每页个数
     * @param studentId 学生ID
     * @return Score list
     */
    List<Score> findById(Integer page, Integer size, Integer studentId);

    /**
     * 根据考试编号查找成绩
     *
     * @param examCode 考试编号
     * @return 考试分数列表
     */
    List<Score> findByExamCode(Integer examCode);

}
