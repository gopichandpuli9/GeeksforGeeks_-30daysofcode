
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends


class Solution{

public:
int find_min(int arr[], int n, int k) {
int sum = 0, pairs = 0;
for (int i = 0; i < n; i++) {
pairs += arr[i] / 2;
if (arr[i] % 2 == 0)
sum += (arr[i] - 2) / 2;
else
sum += (arr[i] - 1) / 2;
}

if (k > pairs) return -1;
if (k <= sum) return 2 * (k - 1) + n + 1;
return 2 * sum + n + (k - sum);

}

};

// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, k;
        cin >> n;
        int a[n];
        for (int i = 0; i < n; i++) cin >> a[i];
        cin >> k;
        Solution obj;
        cout << obj.find_min(a, n, k) << endl;
    }
    return 1;
}
  // } Driver Code Ends
