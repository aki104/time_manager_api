import com.time.manager.core.exception.NotExistException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class ErrorResponse(
    var message: String,
    var statusCode: String
) {
    companion object {
        fun createResponse(e: NotExistException): ResponseEntity<ErrorResponse> {
            return ResponseEntity<ErrorResponse>(
                ErrorResponse(
                    message = e.errorMessage,
                    statusCode = HttpStatus.BAD_REQUEST.value().toString()
                ),
                HttpStatus.FORBIDDEN
            )
        }
    }
}