package builderpattern.after;

import builderpattern.before.TourPlan;
import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("칸쿤 여행")
            .nightsAndDays(2, 3)
            .startDate(LocalDate.of(2020, 12, 9))
            .whereToStay("리조트")
            .addPlan(0, "체크인하고 짐풀기")
            .addPlan(0, "저녁 식사")
            .getPlan();

        TourPlan longBeachTrip = builder.title("롱비치")
            .startDate(LocalDate.of(2021,1,5))
            .getPlan();

        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan cancunTrip = tourDirector.cancunTrip();
    }

}
