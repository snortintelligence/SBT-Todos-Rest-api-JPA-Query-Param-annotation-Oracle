package com.snort.intelli.app.repository;

import com.snort.intelli.app.entites.Todos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TodosRepository extends CrudRepository<Todos, Long> {

//    @Query(value = "SELECT tobj from Todos tobj where title=?1")
//    List<Todos> findByTitleTodosInfo(String title); // find a task where task_title for given title
//
//    @Query(value = "SELECT tobj from Todos tobj where tobj.assignedBy=?1")
//    List<Todos> findAssignedByTodosInfo(String assignedBy); // find a task where task_assigned By someone
//
//    @Query(value = "SELECT tobj from Todos tobj where tobj.difficultyLevel=?1 AND tobj.completed=?2")
//    List<Todos> findByDifficultyLevelAndCompletedTodosInfo(Integer difficultyLevel, String completed); // find a task where difficultyLevel & completed given

//    @Query(value = "SELECT * from tbl_Todos where title=?1", nativeQuery = false)
//    List<Todos> findByTitleTodosInfo(String title); // find a task where task_title for given title
//
//    @Query(value = "SELECT * from tbl_Todos where assigned_By=?1",  nativeQuery = false)
//    List<Todos> findAssignedByTodosInfo(String assignedBy); // find a task where task_assigned By someone
//
//    @Query(value = "SELECT * from tbl_Todos where difficulty_Level=?1 AND completed=?2",  nativeQuery = false)
//    List<Todos> findByDifficultyLevelAndCompletedTodosInfo(Integer difficultyLevel, String completed); // find a task where difficultyLevel & completed given
//
//    @Query(value = "SELECT * from tbl_Todos where title=:task_title", nativeQuery = true)
//    List<Todos> findByTitleTodosInfo(@Param(value = "task_title") String task_title); // find a task where task_title for given title
//
//    @Query(value = "SELECT * from tbl_Todos where assigned_By=:assignedBy",  nativeQuery = true)
//    List<Todos> findAssignedByTodosInfo(@Param("assignedBy") String assignedBy); // find a task where task_assigned By someone
//
//    @Query(value = "SELECT * from tbl_Todos where difficulty_Level=:difficultyLevel AND completed=:completed",  nativeQuery = true)
//    List<Todos> findByDifficultyLevelAndCompletedTodosInfo(@Param("difficultyLevel") Integer difficultyLevel,@Param("completed") String completed); // find a task where difficultyLevel & completed given


    @Query(value = "SELECT tobj from Todos tobj where title=:task_title")
    List<Todos> findByTitleTodosInfo(@Param(value = "task_title") String task_title); // find a task where task_title for given title

    @Query(value = "SELECT tobj from Todos tobj where tobj.assignedBy=:assignedBy")
    List<Todos> findAssignedByTodosInfo(@Param("assignedBy") String assignedBy); // find a task where task_assigned By someone

    @Query(value = "SELECT tobj from Todos tobj where tobj.difficultyLevel=:difficultyLevel AND tobj.completed=:completed")
    List<Todos> findByDifficultyLevelAndCompletedTodosInfo(@Param("difficultyLevel") Integer difficultyLevel,@Param("completed") String completed); // find a task where difficultyLevel & completed given



}
