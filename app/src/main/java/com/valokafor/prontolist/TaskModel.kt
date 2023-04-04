package com.valokafor.prontolist

import androidx.compose.ui.graphics.Color
import com.valokafor.prontolist.ui.theme.primary
import com.valokafor.prontolist.ui.theme.primary60
import com.valokafor.prontolist.ui.theme.tertiary
import org.threeten.bp.LocalDate
import org.threeten.bp.LocalTime
import org.threeten.bp.format.DateTimeFormatter

enum class Priority(val text: String, val color: Color) {
    LOW(text = "Low", color = primary60),
    MEDIUM(text = "Medium", color = primary),
    HIGH(text = "High", color = tertiary)
}

data class TaskModel(
    val title: String = "",
    val dueDate: LocalDate? = null,
    val dueTime: LocalTime? = null,
    val priority: Priority = Priority.LOW,
    val hasReminder: Boolean = false,
    val isCompleted: Boolean = false,
) {

    fun getTaskDate(): String {
        return dueDate?.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")).orEmpty()
    }

    fun getTaskTime(): String {
        return LocalTime.now()?.format(DateTimeFormatter.ofPattern("HH:mm")).orEmpty()
    }

    fun isOutDate(): Boolean {

        try {
            if (dueDate!!.isBefore(LocalDate.now())) {
                return true
            }

            if (dueDate.isEqual(LocalDate.now()) && dueTime!!.isBefore(LocalTime.now())) {
                return true
            }

            return false
        } catch (e: Exception) {
            return false
        }
    }

}

