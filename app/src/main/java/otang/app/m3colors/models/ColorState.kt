package otang.app.m3colors.models

data class ColorState<out T>(val status: Status, val data: T?) {
    companion object {
        fun <T> success(data: T): ColorState<T> {
            return ColorState(Status.SUCCESS, data)
        }

        fun <T> loading(): ColorState<T> {
            return ColorState(Status.LOADING, null)
        }

        fun <T> idle(): ColorState<T> {
            return ColorState(Status.IDLE, null)
        }
    }
}

enum class Status {
    LOADING, SUCCESS, IDLE
}