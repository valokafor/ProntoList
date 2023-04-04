package com.valokafor.prontolist

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class TaskListViewModel(): ViewModel() {
    private val _sampleTasks  = SampleData.getSampleTasks().toMutableStateList()

    val sampleTasks: List<TaskModel>
        get() = _sampleTasks

    fun onTaskChecked(index: Int) {
        val task = sampleTasks[index]
        val updatedTask = task.copy(isCompleted = !task.isCompleted)
        _sampleTasks[index] = updatedTask
    }
}