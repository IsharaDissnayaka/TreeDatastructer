public class Tree {
    private Node Root;
    public Tree(){
        Root=null;
    }

    public Node Find(int Key){
        Node cur =Root;
        while(cur.Idata==Key){
             if(cur.Idata>Key){
                cur = cur.LeftChild;
             }else{
                cur =cur.RightChild;
             }
             if(cur == null){
                return null;
             }
        }
        return cur;
    }
    public Node Insert(int key,double dd){
        Node NewNode = new Node();
        NewNode.Idata=key;
        NewNode.Ddata=dd;

            if(Root==null){
                Root=NewNode;
                return NewNode;
            }
            else{   
                Node Curr = Root;
                    while(true){
                        if(Curr.Idata>key){
                            if(Curr.LeftChild==null){
                                Curr.LeftChild=NewNode;
                            }
                            Curr=Curr.LeftChild;
                        
                        }else{
                            if(Curr.RightChild==null){
                                Curr.RightChild=NewNode;
                            }
                            Curr=Curr.RightChild;
                            
                        }
                    }

                }
        }
}      
        