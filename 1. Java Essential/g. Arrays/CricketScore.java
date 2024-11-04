public class CricketScore {
    public static void main(String[] args) {
        int[] score = {281, 344, 265, 272, 236, 324, 287};
        int n = score.length;
        int sum = 0;
        int count = 0;
        int equal=0;
        for(int i=0; i<n; i++) {
            sum += score[i];
        }
        for(int i=0; i<n; i++) {
            if(score[i]>sum/n) count++;
        }
        for(int i=0; i<n; i++) {
            if(score[i]==sum/n) equal++;
        }
        System.out.println("The average score of the team is "+(sum/n)+" runs");
        System.out.println("No. of matches having a score above average is "+count);
        System.out.println("No. of matches having a score equal to average is "+equal);
        System.out.println("No. of matches having score below average is "+(n-(count+equal)));
    }
}