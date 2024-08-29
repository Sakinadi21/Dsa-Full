package Interval;

public class OverLap {
    /*
    
                              Overlapping Interval
                              
       |    a      |
             |       b       |
      a.start               b.end
       |                     |
       v                     v
       |          c          |    
           c(a.start,b.end) 
           
           
                                      
       |            a                 |
             |       b       |
      a.start                         a.end
       |                               |
       v                               v
       |          c                    |
           c(a.start,a.end)



       |     a     |
       |                    b          |
      a.start                         b.end
       |                               |
       v                               v
       |          c                    |
           c(a.start,b.end)

    Sort the intervals based on start time . (a.start <= b.start)
    c.start = a.start
    c.end = Math.max(a.end,b.end);
    Repeat for all overlapping intervals



    List<Interval>merge(List<Interval>intervals){
    if(intervals.size()< 2) return intervals;
    intervals.sort(comparingint(in -> in.start ));
    List<Interval> result = new LinkedList<>():
    interval first = intervals.get(0);
    int start = first.start;
    int end = first.end;
    for(int i = 1 ; i < intervals.size();i++){
      interval current = intervals.get(i);
      if(current.start <= end){
      end = Math.max(current.end,end);
      } else {
      result.add(new Interval(start,end));
      start = current.start;
      end = current.end;
        }
      }
      result.add(new Interval(start,end)):
      return result ;
      }
     */
}
