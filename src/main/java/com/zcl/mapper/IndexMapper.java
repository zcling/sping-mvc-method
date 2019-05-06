package com.zcl.mapper;

import com.zcl.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zcl on 2019-04-12.
 */
@Repository
public interface IndexMapper {
    List<User> getAll();
}
