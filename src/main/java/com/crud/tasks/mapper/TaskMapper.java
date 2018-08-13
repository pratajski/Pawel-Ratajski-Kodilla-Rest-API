package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;

public class TaskMapper {
    public Task mapToTask (final TaskDto taskDto) {
        return new Task (
                taskDto.getId(),
                taskDto.getTitle(),
                taskDto.getContent()
        );
    }
}
