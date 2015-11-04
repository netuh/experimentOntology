/**
 */
package experimentOntology.operation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Execution Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.CommonExecutionPlan#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see experimentOntology.operation.OperationPackage#getCommonExecutionPlan()
 * @model
 * @generated
 */
public interface CommonExecutionPlan extends ExecutionPlan {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference.
	 * @see #setTasks(ExperimentalTasks)
	 * @see experimentOntology.operation.OperationPackage#getCommonExecutionPlan_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExperimentalTasks getTasks();

	/**
	 * Sets the value of the '{@link experimentOntology.operation.CommonExecutionPlan#getTasks <em>Tasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasks</em>' containment reference.
	 * @see #getTasks()
	 * @generated
	 */
	void setTasks(ExperimentalTasks value);

} // CommonExecutionPlan
