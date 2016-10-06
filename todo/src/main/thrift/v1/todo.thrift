namespace java com.zbiljic.hello.service.core.thrift.v1

struct Todo {
    1: i32 id
    2: string title
    3: string content
    4: bool completed
}

service TodoService {

    Todo createTodo(1:Todo todo)

    Todo getTodo(1:i32 id);

    Todo updateTodo(1:i32 id, 2:Todo updatedTodo)

    void deleteTodo(1:i32 id);

    list<Todo> getAllTodos();

    void deleteAllTodos();
}
