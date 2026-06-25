class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        # Step 1: Sort intervals by their end times (the greedy key)
        intervals.sort(key=lambda x: x[1])
        
        # Initialize prev_end with the end of the first interval
        prev_end = intervals[0][1]
        result = 0
        
        # Step 2: Iterate through the rest of the intervals
        for interval in intervals[1:]:
            # If the current interval starts before the previous one ends, it's an overlap
            if prev_end > interval[0]:
                # We "remove" this interval to minimize overlap
                result += 1
            else:
                # No overlap: update prev_end to the current interval's end
                prev_end = interval[1]
                
        return result