package com.valokafor.prontolist

import org.threeten.bp.LocalDate

object SampleData {
    fun getSampleTasks(): List<TaskModel> {
        return listOf(
            TaskModel(
                title = "Complete project proposal",
                dueDate = LocalDate.parse("2023-02-25"),
                priority = Priority.HIGH,
                hasReminder = true,
                isCompleted = false,
            ),
            TaskModel(
                title = "Buy groceries",
                dueDate = LocalDate.parse("2023-02-22"),
                priority = Priority.MEDIUM,
                hasReminder = true,
                isCompleted = false,
            ),
            TaskModel(
                title = "Go to the gym",
                dueDate = LocalDate.parse("2023-02-21"),
                priority = Priority.LOW,
                hasReminder = false,
                isCompleted = true,
            ),
            TaskModel(
                title = "Read a Knitting book",
                dueDate = LocalDate.parse("2023-02-24"),
                priority = Priority.LOW,
                hasReminder = true,
                isCompleted = false,
            ),
            TaskModel(
                title = "Attend meeting with team",
                dueDate = LocalDate.parse("2023-02-23"),
                priority = Priority.HIGH,
                hasReminder = true,
                isCompleted = false,
            ),
            TaskModel(
                title = "Pay utility bills",
                dueDate = LocalDate.parse("2023-02-28"),
                priority = Priority.MEDIUM,
                hasReminder = true,
                isCompleted = false,
            ),
            TaskModel(
                title = "Clean the house",
                dueDate = LocalDate.parse("2023-02-22"),
                priority = Priority.LOW,
                hasReminder = false,
                isCompleted = false,
            ),
            TaskModel(
                title = "Call mom",
                dueDate = LocalDate.parse("2023-02-27"),
                priority = Priority.LOW,
                hasReminder = true,
                isCompleted = false,
            ),
            TaskModel(
                title = "Finish assessment report",
                dueDate = LocalDate.parse("2023-03-01"),
                priority = Priority.HIGH,
                hasReminder = true,
                isCompleted = false,
            ),
            TaskModel(
                title = "Buy new running shoes",
                dueDate = LocalDate.parse("2023-03-04"),
                priority = Priority.LOW,
                hasReminder = false,
                isCompleted = false,
            ),
            TaskModel(
                title = "Submit income taxes",
                dueDate = LocalDate.parse("2023-04-15"),
                priority = Priority.HIGH,
                hasReminder = true,
                isCompleted = false,
            ),
            TaskModel(
                title = "Go for a walk in the park",
                dueDate = LocalDate.parse("2023-02-21"),
                priority = Priority.LOW,
                hasReminder = false,
                isCompleted = true,
            ),
            TaskModel(
                title = "Meet with new client",
                dueDate = LocalDate.parse("2023-03-02"),
                priority = Priority.HIGH,
                hasReminder = true,
                isCompleted = false,
            ),
            TaskModel(
                title = "Do laundry",
                dueDate = LocalDate.parse("2023-02-23"),
                priority = Priority.HIGH,
                hasReminder = true,
                isCompleted = false,
            ),
            TaskModel(
                title = "Study for midterm exam",
                dueDate = LocalDate.parse("2023-03-06"),
                priority = Priority.HIGH,
                hasReminder = true,
                isCompleted = false,
            ),
            TaskModel(
                title = "Practice coding skills",
                dueDate = LocalDate.parse("2023-02-26"),
                priority = Priority.LOW,
                hasReminder = false,
                isCompleted = true,
            ),
            TaskModel(
                title = "Cook dinner",
                dueDate = LocalDate.parse("2023-02-21"),
                priority = Priority.LOW,
                hasReminder = true,
                isCompleted = true,
            ),
            TaskModel(
                title = "Plan family vacation",
                dueDate = LocalDate.parse("2023-03-10"),
                priority = Priority.MEDIUM,
                hasReminder = true,
                isCompleted = false,
            ),
            TaskModel(
                title = "Go to primary doctor",
                dueDate = LocalDate.parse("2023-03-15"),
                priority = Priority.HIGH,
                hasReminder = true,
                isCompleted = false,
            ),

            TaskModel(
                title = "Clean out closet",
                dueDate = LocalDate.parse("2023-02-28"),
                priority = Priority.LOW,
                hasReminder = false,
                isCompleted = false,
            )
        )
    }
}