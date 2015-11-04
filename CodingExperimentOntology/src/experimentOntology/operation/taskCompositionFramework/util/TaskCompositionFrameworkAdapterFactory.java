/**
 */
package experimentOntology.operation.taskCompositionFramework.util;

import experimentOntology.operation.ContextRelatedTask;
import experimentOntology.operation.ExperimentalTasks;
import experimentOntology.operation.PreTasks;

import experimentOntology.operation.taskCompositionFramework.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage
 * @generated
 */
public class TaskCompositionFrameworkAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TaskCompositionFrameworkPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCompositionFrameworkAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TaskCompositionFrameworkPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskCompositionFrameworkSwitch<Adapter> modelSwitch =
		new TaskCompositionFrameworkSwitch<Adapter>() {
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseRandom(Random object) {
				return createRandomAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseElseIf(ElseIf object) {
				return createElseIfAdapter();
			}
			@Override
			public Adapter caseContextRelatedTask(ContextRelatedTask object) {
				return createContextRelatedTaskAdapter();
			}
			@Override
			public Adapter casePreTasks(PreTasks object) {
				return createPreTasksAdapter();
			}
			@Override
			public Adapter caseExperimentalTasks(ExperimentalTasks object) {
				return createExperimentalTasksAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.operation.taskCompositionFramework.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.operation.taskCompositionFramework.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.operation.taskCompositionFramework.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.operation.taskCompositionFramework.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.operation.taskCompositionFramework.Random <em>Random</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.operation.taskCompositionFramework.Random
	 * @generated
	 */
	public Adapter createRandomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.operation.taskCompositionFramework.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.operation.taskCompositionFramework.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.operation.taskCompositionFramework.ElseIf <em>Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.operation.taskCompositionFramework.ElseIf
	 * @generated
	 */
	public Adapter createElseIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.operation.ContextRelatedTask <em>Context Related Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.operation.ContextRelatedTask
	 * @generated
	 */
	public Adapter createContextRelatedTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.operation.PreTasks <em>Pre Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.operation.PreTasks
	 * @generated
	 */
	public Adapter createPreTasksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.operation.ExperimentalTasks <em>Experimental Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.operation.ExperimentalTasks
	 * @generated
	 */
	public Adapter createExperimentalTasksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TaskCompositionFrameworkAdapterFactory
