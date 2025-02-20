package nextstep.reservation;

import nextstep.schedule.Schedule;

public class Reservation {
    private Long id;
    private final Schedule schedule;
    private final String name;
    private final Long memberId;

    public Reservation(Schedule schedule, String name, Long memberId) {
        this.schedule = schedule;
        this.name = name;
        this.memberId = memberId;
    }

    public Reservation(Long id, Schedule schedule, String name, Long memberId) {
        this.id = id;
        this.schedule = schedule;
        this.name = name;
        this.memberId = memberId;
    }

    public Long getId() {
        return id;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public String getName() {
        return name;
    }

    public Long getMemberId() {
        return memberId;
    }
}
