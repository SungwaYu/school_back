package pers.sungwa.school.service.edu.service.impl;

import pers.sungwa.school.service.edu.entity.Comment;
import pers.sungwa.school.service.edu.mapper.CommentMapper;
import pers.sungwa.school.service.edu.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论 服务实现类
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-12
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
