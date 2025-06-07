# 設定成功機率
p <- 0.3

# 定義失敗次數 X 的範圍 (例如 0 到 15)
x <- 0:15

# 計算幾何分配的機率質量函數
pmf <- dgeom(x, prob = p)

# 繪製幾何分配圖形
barplot(pmf, names.arg = x, col = "purple", main = "幾何分配 (p = 0.3)",
        xlab = "失敗次數 (X)", ylab = "機率 P(X = x)")

# 計算 X = 5 的機率
prob_x5 <- dgeom(5, prob = p)

# 顯示結果
cat("首次成功前發生 X = 5 次失敗的機率為:", prob_x5, "\n")
