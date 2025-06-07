# 設定參數
a <- 0  # 均勻分配的下界
b <- 2  # 均勻分配的上界

# 定義區間
x <- seq(-0.5, 2.5, by = 0.01)  # 擴展範圍以顯示 PDF 外部為 0
pdf <- ifelse(x >= a & x <= b, 1 / (b - a), 0)  # 計算 PDF

# 繪製機率密度函數 (PDF)
plot(x, pdf, type = "l", col = "orange", lwd = 2, ylim = c(0, 0.6),
     main = "均勻分佈 PDF (U[0, 2])", xlab = "X", ylab = "f(X)")
abline(h = 0, col = "black")

# 填充區間 [0.2, 0.8]
x_fill <- seq(0.2, 0.8, by = 0.01)
polygon(c(0.2, x_fill, 0.8), c(0, rep(1 / (b - a), length(x_fill)), 0), col = "yellow", border = NA)

# 計算 P(0.2 <= X <= 0.8)
prob <- (0.8 - 0.2) / (b - a)

# 顯示結果
cat("P(0.2 <= X <= 0.8) =", prob, "\n")
