/**
 */
package experimentOntology.operation.taskCompositionFramework;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.taskCompositionFramework.If#getCondition <em>Condition</em>}</li>
 *   <li>{@link experimentOntology.operation.taskCompositionFramework.If#getElseif <em>Elseif</em>}</li>
 *   <li>{@link experimentOntology.operation.taskCompositionFramework.If#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Task {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage#getIf_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link experimentOntology.operation.taskCompositionFramework.If#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Elseif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elseif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elseif</em>' containment reference.
	 * @see #setElseif(ElseIf)
	 * @see experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage#getIf_Elseif()
	 * @model containment="true"
	 * @generated
	 */
	ElseIf getElseif();

	/**
	 * Sets the value of the '{@link experimentOntology.operation.taskCompositionFramework.If#getElseif <em>Elseif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elseif</em>' containment reference.
	 * @see #getElseif()
	 * @generated
	 */
	void setElseif(ElseIf value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference.
	 * @see #setTask(Task)
	 * @see experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage#getIf_Task()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link experimentOntology.operation.taskCompositionFramework.If#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // If
