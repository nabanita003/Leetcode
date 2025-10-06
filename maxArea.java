class Solution {
public:
    int maxArea(vector<int>& height) {
       int a=0;
       int b = height.size()-1;
       int area;
       int maximum_Area=0;

       while(a<b){
           area = min(height[a],height[b])*(b-a);
           if (area>maximum_Area)
             maximum_Area=area;
           if( min(height[a],height[b])==height[a])
             a++;
           else 
              b--;
       } 
       return maximum_Area;
    }
};
