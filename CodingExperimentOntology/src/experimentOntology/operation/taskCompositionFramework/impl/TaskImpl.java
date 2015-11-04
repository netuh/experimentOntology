/**
 */
package experimentOntology.operation.taskCompositionFramework.impl;

import experimentOntology.operation.impl.PreTasksImpl;

import experimentOntology.operation.taskCompositionFramework.Task;
import experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TaskImpl extends PreTasksImpl implements Task {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskCompositionFrameworkPackage.Literals.TASK;
	}

} //TaskImpl
