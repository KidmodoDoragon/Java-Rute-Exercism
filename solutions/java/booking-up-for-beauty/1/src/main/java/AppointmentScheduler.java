import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Month;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        if(appointmentDate.getHour()>=12 && appointmentDate.getHour()<18){
                return true;
            }
            return false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String description = "'You have an appointment on' EEEE, MMMM d, yyyy, 'at' h:mm a'.'";
        return appointmentDate.format(DateTimeFormatter.ofPattern(description));
    }

    public LocalDate getAnniversaryDate() {
       return LocalDate.of(LocalDate.now().getYear(), Month.SEPTEMBER, 15);
    }
}
