public class trapping_waterrain {
    public static int TrappedRainwater(int height[]){     // Time complexity - O(n)

        int n = height.length;
        // 1.calculate left max boundary 

        int leftmax[] = new int[n];
        leftmax[0] = height[0];       // for first bar

        for(int i=1;i<n;i++){     // not written int i=0 ; because uper count kiya hai...
            leftmax[i] = Math.max(height[i],leftmax[i-1]); // current height i.e height[i] ko compare karenge leftmax[i-1] se 
        }
        // 2.calculate right max boundary 
       // for right max, we start calculating array from backside
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];

        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        int trappedwater = 0;
        // 3.loop

        for(int i=0; i<n; i++){
            // 4.waterlevel = min(leftmax boundary, rightmax boundary)
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
             // 5.trapped water = waterlevel - height[i]
            trappedwater += waterlevel - height[i];
        }

        return trappedwater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println( TrappedRainwater(height));
    }
}
