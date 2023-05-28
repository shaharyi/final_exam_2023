class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public static boolean ex6(BinNode<Node<Integer>> tree){
    if (tree == null)
      return true;
   
    if (tree.hasLeft())
      if (tree.getValue().getValue() <= tree.getLeft().getValue().getValue())
        return false;
    
    if (tree.hasRight()){
      Node<Integer> p1 = tree.getValue();
      while (p1.hasNext())
        p1 = p1.getNext();      
      Node<Integer> p2 = tree.getRight().getValue();
      while (p2.hasNext())
        p2 = p2.getNext();      
      if (p1.getValue() >= p2.getValue())
        return false;
      
    return ex6(tree.getRight()) && ex6(tree.getLeft());
  }
}
