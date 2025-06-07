# 設定參數
p <- 0.4  # 成功機率
r <- 5    # 成功次數
x <- 0:15 # 失敗次數範圍

# 計算負二項分配的機率質量函數
pmf <- dnbinom(x, size = r, prob = p)

# 繪製負二項分配的圖形
barplot(pmf, names.arg = x, col = "lightblue", main = "負二項分配 (p = 0.4, r = 5)",
        xlab = "失敗次數 (X)", ylab = "機率 P(X = x)")

# 計算 X = 7 的機率
prob_x7 <- dnbinom(7, size = r, prob = p)

# 顯示結果
cat("在第 X = 7 次失敗時達到成功的機率為:", prob_x7, "\n")

