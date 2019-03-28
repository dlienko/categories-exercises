object _1 {

  def id[A](a: A): A = a

  def compose[A, B, C](f: A => B, g: B => C): A => C = { a: A => g(f(a)) }

}